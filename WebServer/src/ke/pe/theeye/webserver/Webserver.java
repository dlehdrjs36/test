package ke.pe.theeye.webserver;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 소켓이란 TCP/IP를 이용하는 API를 말한다.
 * 
 * <pre>
 * 웹서버를 구현하는 클래스
 * </pre>
 * 
 * @author eye
 * @since 2010.11.15
 */
class WebServer {
	public static void main(String argv[]) throws Exception {
		// 서버소켓을 생성한다. 웹서버는 기본적으로 80번 포트를 사용한다.
		ServerSocket listenSocket = new ServerSocket(80);
		System.out.println("WebServer Socket Created");

		Socket connectionSocket; // 클라이언트 소켓
		ServerThread serverThread;

		// 순환을 돌면서 클라이언트의 접속을 받는다. accept()는 Blocking 메서드이다(클라이언트 소켓의 접속이 올때까지 기다림.)
		// listenSocket.accept() : 클라이언트의 서버 접속요청
		/**
		 * 소켓이 연결되려면 서버 측의 서버 소켓(ServerSocket)을 통해야 한다. 서버 소켓은 서버에서 직접 통신에 간여하지 않고 창구
		 * 역할만 한다. 서버 소켓은 외부에서 소켓 연결 요청이 오면 클라이언트 소켓과 통신할 서버 측 소켓을 만들고 서로 연결한다.
		 * 
		 * Server.java package net.java_school.socket;
		 * 
		 * import java.io.IOException; import java.net.ServerSocket; import
		 * java.net.Socket;
		 * 
		 * public class Server { public static void main(String[] args) throws
		 * IOException { ServerSocket serverSocket = new ServerSocket(3000); Socket
		 * socket = serverSocket.accept(); //TODO } } 
		 * Socket socket = serverSocket.accept();에서 프로그램은 멈추고 외부의 소켓 접속 요청을 기다린다. 소켓 접속 요청이 오면 클라이언트와
		 * 통신을 할 서버 측 소켓을 만들고 외부 소켓과 연결한 후 레퍼런스가 반환된다. 실제로 접속이 이뤄지는 서버 측 소켓의 포트는 남아있는 포트
		 * 번호 중 임의로 정해진다.
		 */
		// 클라이언트가 서버 접속 요청을하면 서버 소켓과 연결된 클라이언트 소켓을 반환한다. 즉, 클라이언트의 요청이 있을때만 동작함.
		while ((connectionSocket = listenSocket.accept()) != null) {
			InetAddress address = InetAddress.getByName("localhost");
			System.out.println(address);
			// 서버 쓰레드를 생성하여 실행한다.
			serverThread = new ServerThread(connectionSocket); // 서버와 연결된 클라이언트
			serverThread.start();
		}
	}
}
