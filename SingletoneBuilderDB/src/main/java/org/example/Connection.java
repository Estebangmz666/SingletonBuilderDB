Public class Connection{
  private String user:
  private String pass;
  private String host;
  private String codification;
  private int waitingTime;
  private byte connectionAttempts;
  private boolean hasSSL;
  private short port;
  private String database;

  public Connection(){
  }
  
  public Connection(String user, String pass, String host, String codification, int waitingTime, byte connectionAttempts, boolean hasSSL, short port, String database){
    this.user = user;
    this.pass = pass;
    this.host = host;
    this.codification = codification;
    this.waitingTime = waitingTime;
    this.connectionAttempts = connectionAttempts;
    this.hasSSL = hasSSL;
    this.port = port;
    this.database = database;
  }

  public void databaseConnection(User user, Pass pass, Host host, Codification codification, WaitingTime waitingTime, ConnectionAttempts connectionAttempts, HasSSL hasSSL, Port port, Database database){
    assert (DatabaseConnector.geinstance() != null)
    System.printoutln.("Database succesfully connected")
  }

  public static class ConnectionBuilder{
    private String user:
    private String pass;
    private String host;
    private String codification;
    private int waitingTime;
    private byte connectionAttempts;
    private boolean hasSSL;
    private short port;
    private String database;

    public ConnectionBuilder user(String user){
      this.user = user;
      return this;
    }

    public ConnectionBuilder pass(String pass){
      this.pass = pass;
      return this;
    }

    public ConnectionBuilder host(String host){
      this.host = host;
      return this;
    }

    public ConnectionBuilder codification(String codification){
      this.codification = codification;
      return this;
    }

    public ConnectionBuilder waitingTime(int watingTime){
      this.watingTime = watingTime;
      return this;
    }

    public ConnectionBuilder connectionAttempts(byte connectionAttempts){
      this.connectionAttempts = connectionAttempts;
      return this;
    }

    public ConnectionBuilder hasSSL(boolean hasSSL){
      this.hasSSL = false;
      return this;
    }

    public ConnectionBuilder port(short port){
      this.port = port;
      return this;
    }
    
    public ConnectionBuilder database(String database){
      this.database = database;
      return this;
    }

    public Connection build(){
      return new connection(user, pass, host, codification, waitingTime, connectionAttempts, hasSSL, port, database);
    }
  }
}
