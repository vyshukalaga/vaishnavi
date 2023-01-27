# Layers of OSI Model
a. OSI stands for Open Systems Interconnection.  
b. It has been developed by ISO – ‘International Organization for Standardization‘, in the year 1984.  
c. It is a 7 layer architecture with each layer having specific functionality to perform.  
d. All these 7 layers work collaboratively to transmit the data from one person to another across the globe.  
![Layers of OSI model](https://media.geeksforgeeks.org/wp-content/uploads/computer-network-osi-model-layers.png)  
## 1. Physical Layer (Layer 1) :  
a. The lowest layer of the OSI reference model is the physical layer.  
b. It is responsible for the actual physical connection between the devices.  
c. The physical layer contains information in the form of bits. It is responsible for transmitting individual bits from one node to the next.  
d. When receiving data, this layer will get the signal received and convert it into 0s and 1s and send them to the Data Link layer, which will put the frame back together.  
![Physical Layer](https://media.geeksforgeeks.org/wp-content/uploads/computer-network-osi-model-layers-bits.png)  
The functions of the physical layer are as follows:  

**a. Bit synchronization:** The physical layer provides the synchronization of the bits by providing a clock. This clock controls both sender and receiver thus providing synchronization at bit level.  
**b. Bit rate control:** The Physical layer also defines the transmission rate i.e. the number of bits sent per second.  
**c. Physical topologies:** Physical layer specifies the way in which the different, devices/nodes are arranged in a network i.e. bus, star, or mesh topology.  
**d. Transmission mode:** Physical layer also defines the way in which the data flows between the two connected devices. The various transmission modes possible are Simplex, half-duplex and full-duplex.  
## 2. Data Link Layer (DLL) (Layer 2) :  
a. The data link layer is responsible for the node-to-node delivery of the message.  
b. The main function of this layer is to make sure data transfer is error-free from one node to another, over the physical layer.  
Data Link Layer is divided into two sublayers:
1. Logical Link Control (LLC)  
2. Media Access Control (MAC)  
![DLL layer](https://media.geeksforgeeks.org/wp-content/uploads/computer-network-osi-model-layers-framing.png)  
The functions of the Data Link layer are :  

**a. Framing:** Framing is a function of the data link layer. It provides a way for a sender to transmit a set of bits that are meaningful to the receiver. This can be accomplished by attaching special bit patterns to the beginning and end of the frame.  
**b. Physical addressing:** After creating frames, the Data link layer adds physical addresses (MAC address) of the sender and/or receiver in the header of each frame. **c. Error control:** Data link layer provides the mechanism of error control in which it detects and retransmits damaged or lost frames.  
**d. Flow Control:** The data rate must be constant on both sides else the data may get corrupted thus, flow control coordinates the amount of data that can be sent before receiving acknowledgement.  
**e.Access control:** When a single communication channel is shared by multiple devices, the MAC sub-layer of the data link layer helps to determine which device has control over the channel at a given time.  
## 3. Network Layer (Layer 3) :  
a. The network layer works for the transmission of data from one host to the other located in different networks.  
b. It also takes care of packet routing i.e. selection of the shortest path to transmit the packet, from the number of routes available.  
The functions of the Network layer are :

**a. Routing:** The network layer protocols determine which route is suitable from source to destination. This function of the network layer is known as routing.  
**b. Logical Addressing:** In order to identify each device on internetwork uniquely, the network layer defines an addressing scheme. The sender & receiver’s IP addresses are placed in the header by the network layer. Such an address distinguishes each device uniquely and universally.  
![Network layer](https://media.geeksforgeeks.org/wp-content/uploads/computer-network-osi-model-layers-packet.png)  
## 4. Transport Layer (Layer 4) :  
a. The transport layer provides services to the application layer and takes services from the network layer.  
b. The data in the transport layer is referred to as Segments.  
c. It is responsible for the End to End Delivery of the complete message.  
d. The transport layer also provides the acknowledgement of the successful data transmission and re-transmits the data if an error is found.  
**At sender’s side:** Transport layer receives the formatted data from the upper layers, performs Segmentation, and also implements Flow & Error control to ensure proper data transmission.  
**At receiver’s side:** Transport Layer reads the port number from its header and forwards the Data which it has received to the respective application. It also performs sequencing and reassembling of the segmented data.  
The functions of the transport layer are as follows:  
**a. Segmentation and Reassembly:** This layer accepts the message from the (session) layer, and breaks the message into smaller units. Each of the segments produced has a header associated with it. The transport layer at the destination station reassembles the message.  
**b. Service Point Addressing:** In order to deliver the message to the correct process, the transport layer header includes a type of address called service point address or port address. Thus by specifying this address, the transport layer makes sure that the message is delivered to the correct process.  
The services provided by the transport layer :  

**A. Connection-Oriented Service:** It is a three-phase process that includes 
– Connection Establishment 
– Data Transfer 
– Termination / disconnection  
In this type of transmission, the receiving device sends an acknowledgement, back to the source after a packet or group of packets is received. This type of transmission is reliable and secure.  
**B. Connectionless service:** It is a one-phase process and includes Data Transfer. In this type of transmission, the receiver does not acknowledge receipt of a packet. This approach allows for much faster communication between devices. Connection-oriented service is more reliable than connectionless Service. 

_*Data in the Transport Layer is called as **Segments.**_  
_*Transport layer is operated by the Operating System. It is a part of the OS and communicates with the Application Layer by making system calls. 
Transport Layer is called as **Heart of OSI** model._  
## 5. Session Layer (Layer 5) :  
a. This layer is responsible for the establishment of connection, maintenance of sessions, authentication, and also ensures security.  
The functions of the session layer are :

**a. Session establishment, maintenance, and termination:** The layer allows the two processes to establish, use and terminate a connection.  
**b. Synchronization:** This layer allows a process to add checkpoints which are considered synchronization points into the data. These synchronization points help to identify the error so that the data is re-synchronized properly, and ends of the messages are not cut prematurely and data loss is avoided.  
**c. Dialog Controller:** The session layer allows two systems to start communication with each other in half-duplex or full-duplex.

_*All the below 3 layers(including Session Layer) are integrated as a single layer in the TCP/IP model as “Application Layer”.  
*Implementation of these 3 layers is done by the network application itself. These are also known as **Upper Layers** or **Software Layers.**_  
## Scenario: 
Let us consider a scenario where a user wants to send a message through some Messenger application running in his browser. The “Messenger” here acts as the application layer which provides the user with an interface to create the data. This message or so-called Data is compressed, encrypted (if any secure data), and converted into bits (0’s and 1’s) so that it can be transmitted.  
![scenrio](https://media.geeksforgeeks.org/wp-content/uploads/computer-network-osi-model-layers-session.png)  
## 6. Presentation Layer (Layer 6):  
a. The presentation layer is also called the Translation layer.  
b. The data from the application layer is extracted here and manipulated as per the required format to transmit over the network.  
The functions of the presentation layer are :  

**a. Translation:** For example, ASCII to EBCDIC.  
**b. Encryption/ Decryption:** Data encryption translates the data into another form or code. The encrypted data is known as the ciphertext and the decrypted data is known as plain text. A key value is used for encrypting as well as decrypting data.  
**c.Compression:** Reduces the number of bits that need to be transmitted on the network.  
## 7. Application Layer (Layer 7) :
a. At the very top of the OSI Reference Model stack of layers, we find the Application layer which is implemented by the network applications.  
b. These applications produce the data, which has to be transferred over the network. This layer also serves as a window for the application services to access the network and for displaying the received information to the user.  
Example: Application – Browsers, Skype Messenger, etc.  
![desktop layer](https://media.geeksforgeeks.org/wp-content/uploads/computer-network-osi-model-layers-application.png)  
The functions of the Application layer are :  

a. Network Virtual Terminal  
b. FTAM-File transfer access and management  
c. Mail Services  
d. Directory Services  
**OSI model** acts as a reference model and is not implemented on the Internet because of its late invention. The current model being used is the TCP/IP model.  
**OSI model in a nutshell**  
![OSI model in nutshell](https://media.geeksforgeeks.org/wp-content/uploads/20220511230638/OSImodelakhilabhilash01.png)  










