package com.github.sharpware.pim.web.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Entidade<T extends Entidade> implements Serializable
{
    @Id
    @Column(name = "id")
    protected long id;

    public long getId() {
        return id;
    }

    public T setId(int id) {
        this.id = id;
        return (T) this;
    }
    
    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 23 * hash + (int) this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Entidade other = (Entidade) obj;
        return this.id == other.id;
    }
}
