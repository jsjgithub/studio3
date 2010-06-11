/**
 * This file Copyright (c) 2005-2008 Aptana, Inc. This program is
 * dual-licensed under both the Aptana Public License and the GNU General
 * Public license. You may elect to use one or the other of these licenses.
 * 
 * This program is distributed in the hope that it will be useful, but
 * AS-IS and WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE, TITLE, or
 * NONINFRINGEMENT. Redistribution, except as permitted by whichever of
 * the GPL or APL you select, is prohibited.
 *
 * 1. For the GPL license (GPL), you can redistribute and/or modify this
 * program under the terms of the GNU General Public License,
 * Version 3, as published by the Free Software Foundation.  You should
 * have received a copy of the GNU General Public License, Version 3 along
 * with this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Aptana provides a special exception to allow redistribution of this file
 * with certain other free and open source software ("FOSS") code and certain additional terms
 * pursuant to Section 7 of the GPL. You may view the exception and these
 * terms on the web at http://www.aptana.com/legal/gpl/.
 * 
 * 2. For the Aptana Public License (APL), this program and the
 * accompanying materials are made available under the terms of the APL
 * v1.0 which accompanies this distribution, and is available at
 * http://www.aptana.com/legal/apl/.
 * 
 * You may view the GPL, Aptana's exception and additional terms, and the
 * APL in the file titled license.html at the root of the corresponding
 * plugin containing this source file.
 * 
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.core.internal.resources;

import java.util.Map;

import com.aptana.core.CorePlugin;


/**
 *
 */
@SuppressWarnings({"restriction", "unchecked"})
public class MarkerInfo extends org.eclipse.core.internal.resources.MarkerInfo {

	/** UNDEFINED_ID */
	protected static final long UNDEFINED_ID = org.eclipse.core.internal.resources.MarkerInfo.UNDEFINED_ID;

	/* (non-Javadoc)
	 * @see org.eclipse.core.internal.resources.MarkerInfo#setAttributes(java.util.Map, boolean)
	 */
	public void setAttributes(Map map, boolean validate) {
		Class superClass = getClass().getSuperclass();
		try {
			try {
				superClass.getMethod("setAttributes", Map.class).invoke(this, map);
				return;
			} catch (NoSuchMethodException e) {
			}
			superClass.getMethod("setAttributes", Map.class, Boolean.class).invoke(this, map, validate);
		} catch (Exception e) {
			CorePlugin.log(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.internal.resources.MarkerInfo#setAttribute(java.lang.String, java.lang.Object, boolean)
	 */
	public void setAttribute(String attributeName, Object value, boolean validate) {
		Class superClass = getClass().getSuperclass();
		try {
			try {
				superClass.getMethod("setAttribute", String.class, Object.class).invoke(this, attributeName, value);
				return;
			} catch (NoSuchMethodException e) {
			}
			superClass.getMethod("setAttribute", String.class, Object.class, Boolean.class).invoke(this, attributeName, value, validate);
		} catch (Exception e) {
			CorePlugin.log(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.internal.resources.MarkerInfo#setAttributes(java.lang.String[], java.lang.Object[], boolean)
	 */
	public void setAttributes(String[] attributeNames, Object[] values, boolean validate) {
		Class superClass = getClass().getSuperclass();
		try {
			try {
				superClass.getMethod("setAttributes", String[].class, Object[].class).invoke(this, attributeNames, values);
				return;
			} catch (NoSuchMethodException e) {
			}
			superClass.getMethod("setAttributes", String[].class, Object[].class, Boolean.class).invoke(this, attributeNames, values, validate);
		} catch (Exception e) {
			CorePlugin.log(e);
		}
	}

}
