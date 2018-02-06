package com.ifpb.dac.jpa;

import com.ifpb.dac.jpa.Telefone;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-05T11:28:51")
@StaticMetamodel(Contato.class)
public class Contato_ { 

    public static volatile ListAttribute<Contato, String> emails;
    public static volatile SingularAttribute<Contato, String> apelido;
    public static volatile SingularAttribute<Contato, byte[]> foto;
    public static volatile SingularAttribute<Contato, String> nome;
    public static volatile SingularAttribute<Contato, Integer> id;
    public static volatile SingularAttribute<Contato, String> sobreNome;
    public static volatile SingularAttribute<Contato, LocalDate> dataCriacao;
    public static volatile ListAttribute<Contato, Telefone> telefones;
    public static volatile SingularAttribute<Contato, String> descricao;

}