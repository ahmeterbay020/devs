package kodlama.io.devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "SubLangTechnologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubLangTech {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "langName",nullable = false)
    private String langName;
}
