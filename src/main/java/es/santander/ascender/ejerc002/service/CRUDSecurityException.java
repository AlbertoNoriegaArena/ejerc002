package es.santander.ascender.ejerc002.service;

public class CRUDSecurityException extends RuntimeException {

    private final CRUDOperation operation;
    private final Long id;

    public CRUDSecurityException(CRUDOperation operation, Long id) {
        this.operation = operation;
        this.id = id;
    }

    public CRUDSecurityException(String message, CRUDOperation operation, Long id) {
        super(message);
        this.operation = operation;
        this.id = id;
    }

    public CRUDOperation getOperation() {
        return operation;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "OperacionSecurityException [operation=" + operation + ", id=" + id + ", toString()=" + super.toString()
                + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CRUDSecurityException other = (CRUDSecurityException) obj;
        if (operation != other.operation)
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((operation == null) ? 0 : operation.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
