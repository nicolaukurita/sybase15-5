package br.com.etematica;

public class Objeto {

    private Long id;
    private String database;
    private String schema;
    private String name;
    private String type;

    public Objeto(Long id, String database, String schema, String name, String type) {
        this.id = id;
        this.database = database;
        this.schema = schema;
        this.name = name;
        this.type = type;
    }

    public Objeto() {

    }

    @Override
    public String toString() {
        return "Objeto{" +
                "id=" + id +
                ", database='" + database + '\'' +
                ", schema='" + schema + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
