/*******************************************************************************
 * Copyright (c) 2016, 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Eurotech
 *  Amit Kumar Mondal
 *
 *******************************************************************************/
package org.eclipse.kura.wire;

import java.util.Set;

import org.eclipse.kura.KuraException;

/**
 * This WireService interface provides all necessary service API methods to
 * manipulate wire mechanisms in Kura Wires topology.
 *
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface WireService {

    /**
     * Creates the wire configuration for the provided wire emitter and the wire
     * receiver.
     *
     * @param emitterPid
     *            the PID of the wire emitter (this PID will internally be used
     *            to retrieve kura.service.pid property of any matching DS
     *            component).
     * @param receiverPid
     *            the PID of the wire receiver (this PID will internally be used
     *            to retrieve kura.service.pid property of any matching DS
     *            component).
     * @return the recently created wire instance.
     * @throws KuraException
     *             if there are no services associated to the provided {@code emitterPid} or {@code receiverPid}.
     * @throws KuraException
     *             if the provided {@code emitterPid} does not belong to a Wire
     *             Emitter or if the {@code receiverPid} does not belong to a Wire
     *             Receiver.
     * @throws NullPointerException
     *             if any of the arguments is null.
     */
    public WireConfiguration createWireConfiguration(String emitterPid, String receiverPid) throws KuraException;

    /**
     * Removes the provided wire configuration for the provided wire emitter and
     * the wire receiver.
     *
     * @param wireConfiguration
     *            the wire configuration to be deleted.
     * @throws NullPointerException
     *             if the argument is null.
     * @throws IllegalArgumentException
     *             if the provided argument is illegal or inappropriate.
     */
    public void deleteWireConfiguration(WireConfiguration wireConfiguration);

    /**
     * Retrieves the set of already created Wire Configurations.
     *
     * @return the set of wire configurations.
     */
    public Set<WireConfiguration> getWireConfigurations();

}
