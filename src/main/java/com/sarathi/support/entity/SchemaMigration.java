package  com.sarathi.support.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "schema_migrations", schema = "public")
public class SchemaMigration {
    @Id

    @Column(name = "version", nullable = false)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    //TODO [Reverse Engineering] generate columns from DB
}