package shape;

public interface SerialCommunication {

	void send(byte[] data);
	byte[] receive();
}
