/*
 * ============================================================================
 * GNU Lesser General Public License
 * ============================================================================
 *
 * JasperReports - Free Java report-generating library.
 * Copyright (C) 2001-2009 JasperSoft Corporation http://www.jaspersoft.com
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 * 
 * JasperSoft Corporation
 * 539 Bryant Street, Suite 100
 * San Francisco, CA 94107
 * http://www.jaspersoft.com
 */
package net.sf.jasperreports.engine.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import mondrian.olap.InvalidArgumentException;

/**
 * {@link BigDecimalHandler} implementation used on Java 1.5 or newer.
 * 
 * <p>
 * This implementation uses a configured minimum precision when performing
 * divisions.
 * 
 * @author Lucian Chirita (lucianc@users.sourceforge.net)
 * @version $Id$
 * @see BigDecimalUtils#divide(BigDecimal, BigDecimal)
 * @see #PROPERTY_MINIMUM_PRECISION
 */
public class Java15BigDecimalHandler implements BigDecimalHandler
{

	/**
	 * An integer property that provides the minimum precision to be used for 
	 * division operations.
	 * 
	 * <p>
	 * The property can only be set globally.  The default value is 16.
	 */
	public static final String PROPERTY_MINIMUM_PRECISION = 
		JRProperties.PROPERTY_PREFIX + "big.decimal.minimum.precision";
	
	private final int minPrecision;
	private final ThreadLocal mathContexts;
	
	public Java15BigDecimalHandler()
	{
		this(readConfiguredPrecision());
	}
	
	public Java15BigDecimalHandler(final int minPrecision)
	{
		if (minPrecision <= 0)
		{
			throw new InvalidArgumentException("minPrecision must be positive");
		}
		
		this.minPrecision = minPrecision;
		this.mathContexts = new ThreadLocal();
	}
	
	private static int readConfiguredPrecision()
	{
		return JRProperties.getIntegerProperty(PROPERTY_MINIMUM_PRECISION);
	}
	
	/**
	 * Divides the values using the biggest of the dividend precision, 
	 * the divisor precision and the configured minimum precision as result
	 * precision, and {@link RoundingMode#HALF_UP} as rounding mode.
	 * 
	 * @see #PROPERTY_MINIMUM_PRECISION
	 */
	public BigDecimal divide(BigDecimal dividend, BigDecimal divisor)
	{
		int precision = getDivisionPrecision(dividend, divisor);
		MathContext mathContext = getMathContext(precision);
		return dividend.divide(divisor, mathContext);
	}

	protected int getDivisionPrecision(BigDecimal dividend, BigDecimal divisor)
	{
		int precision = minPrecision;
		if (dividend.precision() > precision)
		{
			precision = dividend.precision();
		}
		if (divisor.precision() > precision)
		{
			precision = divisor.precision();
		}
		return precision;
	}
	
	protected MathContext getMathContext(int precision)
	{
		MathContext[] contexts = (MathContext[]) mathContexts.get();
		int idx = precision - minPrecision;
		if (contexts == null || contexts.length < idx + 1)
		{
			MathContext[] newContexts = new MathContext[idx + 1];
			if (contexts != null)
			{
				System.arraycopy(contexts, 0, newContexts, 0, contexts.length);
			}
			
			mathContexts.set(newContexts);
			contexts = newContexts;
		}
		
		MathContext mathContext = contexts[idx];
		if (mathContext == null)
		{
			mathContext = new MathContext(precision, RoundingMode.HALF_UP);
			contexts[idx] = mathContext;
		}
		return mathContext;
	}
}
