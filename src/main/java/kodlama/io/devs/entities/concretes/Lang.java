package kodlama.io.devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="langs")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Lang {
    @Id //primary key alanı ıd ile verilir
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "name")
    private String name;


}
