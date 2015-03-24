package webservices.demo;

public class ScoreServiceProxy implements webservices.demo.ScoreService {
  private String _endpoint = null;
  private webservices.demo.ScoreService scoreService = null;
  
  public ScoreServiceProxy() {
    _initScoreServiceProxy();
  }
  
  public ScoreServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initScoreServiceProxy();
  }
  
  private void _initScoreServiceProxy() {
    try {
      scoreService = (new webservices.demo.ScoreServiceServiceLocator()).getScoreService();
      if (scoreService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)scoreService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)scoreService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (scoreService != null)
      ((javax.xml.rpc.Stub)scoreService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.demo.ScoreService getScoreService() {
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService;
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService.sayHello(name);
  }
  
  public double findScore(java.lang.String name) throws java.rmi.RemoteException{
    if (scoreService == null)
      _initScoreServiceProxy();
    return scoreService.findScore(name);
  }
  
  
}