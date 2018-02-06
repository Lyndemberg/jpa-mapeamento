package com.ifpb.dac.jpa.main;

import com.ifpb.dac.jpa.Contato;
import com.ifpb.dac.jpa.Telefone;
import com.ifpb.dac.jpa.TipoTelefone;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author lyndemberg
 */
public class App {
    public static void main(String[] args) throws IOException{
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PgPersistence");
        EntityManager em = factory.createEntityManager();
        
        List<String> emails = new ArrayList<>();
        List<Telefone> telefones = new ArrayList<>();
        emails.add("lyndembergbatista@outlook.com");
        emails.add("lyndemberg@gmail.com");
        emails.add("lyndembergbatista@yahoo.com");
        emails.add("lyndemberg_batista@hotmail.com");
        telefones.add(new Telefone("993271398", TipoTelefone.Celular));
        telefones.add(new Telefone("993151293", TipoTelefone.Celular));
        telefones.add(new Telefone("991782118", TipoTelefone.Celular));
        byte[] foto = Files.readAllBytes(Paths.get("perfil.jpg"));        
        Contato contato = new Contato("Lyndemberg", "Batista", "Berg", "Descrição aqui", 
                foto, emails, LocalDate.now(), telefones);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(contato);
        transaction.commit();
    }
}
