/*
 * OpenCredo-Esper - simplifies adopting Esper in Java applications. 
 * Copyright (C) 2010  OpenCredo Ltd.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.opencredo.esper.samples.noodlebar.domain;

/**
 * A marker interface used to send {@link NoodleOrder} orders to noodle bars.
 * 
 * @author Russ Miles (russ.miles@opencredo.com)
 * 
 */
public interface NoodleBar {

    /**
     * Places a noodle order.
     * 
     * @param order
     *            the new noodle order being placed.
     */
    public void placeOrder(NoodleOrder order);

}
