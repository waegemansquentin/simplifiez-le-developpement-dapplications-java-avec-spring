package org.example.demo.ticket.business.impl.manager;

import org.example.demo.ticket.business.contract.manager.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjetManager;

public class ManagerFactoryImpl implements ManagerFactory {

    // Ajout d'un attribut projetManager
    private ProjetManager projetManager;
    private TicketManagerImpl ticketManager;

    @Override
    public ProjetManager getProjetManager() {
        return projetManager;
    }

    @Override
    public void setProjetManager(ProjetManager projetManager) {
        this.projetManager = projetManager;
    }

    @Override
    public TicketManagerImpl getTicketManager() {
        return ticketManager;
    }

    @Override
    public void setTicketManager(TicketManagerImpl ticketManager) {
        this.ticketManager = ticketManager;
    }

    //...
}
