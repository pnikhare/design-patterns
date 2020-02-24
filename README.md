# design-patterns

## Factory Pattern
Components of Pattern :

1. Concrete Implelementation : In the example WashinMac , AC, Fridge are the concrete implemetations of interface Machine
2. Creator : MachineFactory class that returns the correct instance of Machine based on the input from Client.
3. FactoryPattern class is client program.

If there is any addition to types of Machine, Only the creator needs to be updated.

Use Cases :
1. Paint Program : Circle, Rectange, square etc implement shape and main program can get any of the instance.
2. Ticketing Program : Air , Train , Bus Tickets as concrete implementation

## Singleton Pattern
Only one instance of Class is created. Thus the constructor is private and the instance is public.
Two methods of initialization :
1. Early Initialization : The instance can be initialized when the class loads . and the same instance is returned whenever client program requests.
2. Lazy initialization : The instance is initialized only on the first call. To make the initilzation thread safe the instance can be created inside a synchronized block.

Use Cases :
1. Single Database connection
2. Logger
3. access to limited resource
