package com.github.sharpware.pim.web.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa<Cliente> {

}