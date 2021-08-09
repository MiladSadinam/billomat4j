/*
 * Copyright 2012 Oliver Siegmar
 *
 * This file is part of Billomat4J.
 *
 * Billomat4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Billomat4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Billomat4J.  If not, see <https://www.gnu.org/licenses/>.
 */

package integrationtest.user;

import integrationtest.AbstractCustomFieldServiceIT;
import integrationtest.ServiceHolder;

public class UserCustomFieldIT extends AbstractCustomFieldServiceIT {

    public UserCustomFieldIT() {
        setService(ServiceHolder.USER);
    }

    @Override
    protected int buildOwner() {
        return ServiceHolder.USER.findUsers(null).iterator().next().getId();
    }

    @Override
    protected void deleteOwner(final int ownerId) {
    }

}
