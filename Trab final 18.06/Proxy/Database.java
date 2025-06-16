package Proxy;

//Interface comum (Subject)
interface Database {
    void query(String sql) throws Exception; // Método para executar consultas SQL
}