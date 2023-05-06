package org.example.demo.ticket.business.contract.manager;

import org.example.demo.ticket.business.impl.manager.TicketManagerImpl;

public interface ManagerFactory {
    ProjetManager getProjetManager();

    void setProjetManager(ProjetManager projetManager);

    TicketManagerImpl getTicketManager();

    void setTicketManager(TicketManagerImpl ticketManager);
}
