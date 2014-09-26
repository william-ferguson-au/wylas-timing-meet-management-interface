Wylas Timing Meet Manager Service interface
===========================================

Wylas Timing is a wireless sports timing system for swimming and athletics.

This project describes an interface by which Wylas Timing communicates with a Meet Manager application.

A Meet Manager can enable integration by implementing the MeetManagerService interface and declaring the service to be available using the java.util.ServiceLoader mechanism.

For those Meet Managers that want to communicate via RESTful web services contact support@wylas-timing.com and we can provide a simple example of doing so.

There exist implementations for a number of Meet Managers.
Ask your Meet Manager vendor if they do, and if not, why not?
