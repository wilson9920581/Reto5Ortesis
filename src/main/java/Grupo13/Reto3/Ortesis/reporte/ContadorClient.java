package Grupo13.Reto3.Ortesis.reporte;

import Grupo13.Reto3.Ortesis.Modelo.Client;

public class ContadorClient {
    private Long total;
    private Client client;

    public ContadorClient(Long total, Client client) {
        this.total = total;
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
