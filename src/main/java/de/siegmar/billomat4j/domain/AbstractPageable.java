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

package de.siegmar.billomat4j.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AbstractPageable<E> implements Pageable<E> {

    @JsonProperty("@page")
    private Integer page;

    @JsonProperty("@per_page")
    private Integer perPage;

    @JsonProperty("@total")
    private Integer total;

    @Override
    public Integer getPage() {
        return page;
    }

    @Override
    public Integer getPerPage() {
        return perPage;
    }

    @Override
    public Integer getTotal() {
        return total;
    }

}
