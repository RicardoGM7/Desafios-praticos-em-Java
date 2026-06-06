package QuestaoDePedidos;

import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private LocalDate BirthDate;

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        BirthDate = birthDate;
    }
    
    @Override
    public String toString() {
        return name + "(" + BirthDate.format(Pedidos.fmt1) + ")" + "-" + email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getBirthDate() {
        return BirthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }
    
}
