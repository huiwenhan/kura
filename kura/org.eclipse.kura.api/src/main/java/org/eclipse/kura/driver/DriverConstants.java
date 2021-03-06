/*******************************************************************************
 * Copyright (c) 2016, 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package org.eclipse.kura.driver;

/**
 * The Enum DriverConstants contains all the necessary constants required for
 * Drivers of Kura Asset Model
 */
public enum DriverConstants {

    /** Channel Name Property to be used in the configuration. */
    CHANNEL_NAME("+name"),

    /** Value type Property to be used in the configuration. */
    CHANNEL_VALUE_TYPE("+value.type");

    /** The value. */
    private String value;

    /**
     * Instantiates a new driver constants.
     *
     * @param value
     *            the value
     */
    private DriverConstants(final String value) {
        this.value = value;
    }

    /**
     * Returns the string representation of the constant
     *
     * @return the string representation
     */
    public String value() {
        return this.value;
    }

}
