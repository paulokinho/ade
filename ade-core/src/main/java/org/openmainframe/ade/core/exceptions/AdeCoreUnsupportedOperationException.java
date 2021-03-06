/*
 
    Copyright IBM Corp. 2010, 2016
    This file is part of Anomaly Detection Engine for Linux Logs (ADE).

    ADE is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    ADE is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ADE.  If not, see <http://www.gnu.org/licenses/>.
 
*/
package org.openmainframe.ade.core.exceptions;

/** Indicates an object does not support a specific method, e.g., a setter call on a read-only object */
public class AdeCoreUnsupportedOperationException extends UnsupportedOperationException {
    static String copyright() {
        return Copyright.IBM_COPYRIGHT;
    }

    private static final long serialVersionUID = 1L;

    public AdeCoreUnsupportedOperationException(String msg) {
        super(msg);
    }

    public AdeCoreUnsupportedOperationException(String msg, Exception e) {
        super(msg, e);
    }

}
