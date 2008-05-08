/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2008 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.desktop;

import java.awt.event.MouseEvent;

/**
 * Provides a default implementation of the {@link DesktopAdapter} interface.
 * <p>
 * This implementation is meant to help application developers by providing standard
 * implementations of all {@link DesktopAdapter} methods, letting subclasses concentrate
 * on what's important rather than mundane.
 * </p>
 * <p>
 * Moreover, an instance of <code>DefaultDesktopAdapter</code> will be used by the
 * {@link DesktopManager} if no valid desktop could be identifier.
 * </p>
 * @author Nicolas Rinaudo
 */
public class DefaultDesktopAdapter implements DesktopAdapter {
    public String toString() {return "Default Desktop";}

    /**
     * Returns <code>true</code>.
     * @return <code>true</code>.
     */
    public boolean isAvailable() {return true;}

    /**
     * Initialises this desktop.
     * <p>
     * This method is empty. See {@link DesktopAdapter#init(boolean)} for information on
     * how to override it.
     * </p>
     * @param  install                        <code>true</code> if this is the application's first boot, <code>false</code> otherwise.
     * @throws DesktopInitialisationException if any error occurs.
     */
    public void init(boolean install) throws DesktopInitialisationException {}

    /**
     * Returns <code>true</code> if the specified mouse event describes a left click.
     * <p>
     * This method will return <code>true</code> if <code>(e.getModifiers() & MouseEvent.BUTTON1_MASK)</code>
     * doesn't equal 0.
     * </p>
     * @param  e event to check.
     * @return   <code>true</code> if the specified event is a left-click, <code>false</code> otherwise.
     * @see      #isRightMouseButton(MouseEvent)
     * @see      #isMiddleMouseButton(MouseEvent)
     */
    public boolean isLeftMouseButton(MouseEvent e) {return (e.getModifiers() & MouseEvent.BUTTON1_MASK) != 0;}

    /**
     * Returns <code>true</code> if the specified mouse event describes a middle click.
     * <p>
     * This method will return <code>true</code> if <code>(e.getModifiers() & MouseEvent.BUTTON3_MASK)</code>
     * doesn't equal 0.
     * </p>
     * @param  e event to check.
     * @return   <code>true</code> if the specified event is a middle-click, <code>false</code> otherwise.
     * @see      #isRightMouseButton(MouseEvent)
     * @see      #isLeftMouseButton(MouseEvent)
     */
    public boolean isRightMouseButton(MouseEvent e) {return (e.getModifiers() & MouseEvent.BUTTON3_MASK) !=0;}

    /**
     * Returns <code>true</code> if the specified mouse event describes a right click.
     * <p>
     * This method will return <code>true</code> if <code>(e.getModifiers() & MouseEvent.BUTTON2_MASK)</code>
     * doesn't equal 0.
     * </p>
     * @param  e event to check.
     * @return   <code>true</code> if the specified event is a right-click, <code>false</code> otherwise.
     * @see      #isLeftMouseButton(MouseEvent)
     * @see      #isMiddleMouseButton(MouseEvent)
     */
    public boolean isMiddleMouseButton(MouseEvent e) {return (e.getModifiers() & MouseEvent.BUTTON2_MASK) != 0;}

    /**
     * Returns <code>/bin/sh -l -c"</code>.
     * @return <code>/bin/sh -l -c"</code>.
     */
    public String getDefaultShell() {return "/bin/sh -l -c";}
}