/*
 * JBoss, Home of Professional Open Source
 * Copyright 2006, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.metadata.javaee.support;

/**
 * NamedMetaData.
 *
 * @author <a href="adrian@jboss.com">Adrian Brock</a>
 * @version $Revision: 1.1 $
 */
public abstract class NamedMetaData extends IdMetaDataImpl implements MappableMetaData {
    /**
     * The serialVersionUID
     */
    private static final long serialVersionUID = -2918254376676527511L;

    /**
     * The name
     */
    private String name;

    @Override
    public String getKey() {
        return getName();
    }

    /**
     * Get the name.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name.
     *
     * @param name the name.
     * @throws IllegalArgumentException for a null name
     */
    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Null name");
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() == getClass() == false)
            return false;
        String name = getName();
        NamedMetaData other = (NamedMetaData) obj;
        String otherName = other.getName();
        return name.equals(otherName);
    }

    @Override
    public int hashCode() {
        String name = getName();
        if (name == null)
            return 0;
        return name.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "{" + getName() + "}";
    }
}
