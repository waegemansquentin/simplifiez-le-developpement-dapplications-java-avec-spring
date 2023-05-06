package org.example.demo.ticket.business.contract.manager;


import java.util.ArrayList;
import java.util.List;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;


/**
 * Manager des beans du package Projet.
 *
 * @author lgu
 */
public interface ProjetManager {

    Projet getProjet(Integer pId) throws NotFoundException;

    List<Projet> getListProjet();
}
