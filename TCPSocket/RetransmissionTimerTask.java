package TCPSocket;
import java.util.TimerTask;
class RetransmissionTimerTask extends TimerTask{
	@Override
	public void run(){
		//loop over linkedHashMap and resend all
		tcpSocketImpl.retransmit.set(true);
	}
	TCPSocketImpl tcpSocketImpl;
	public RetransmissionTimerTask(TCPSocketImpl forCallBack){
		tcpSocketImpl=forCallBack;
	}
}