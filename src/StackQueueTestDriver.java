public class StackQueueTestDriver {
        public static void main(String[] args) {

            StackQueue test = new StackQueue();//creates a new stack

            System.out.println(java.util.Optional.ofNullable(test.peek()));//tests peek method when there is nothing inside
            // (output: null)

            test.enqueue(88);//tests push method if it can correctly add on a new value

            System.out.println(java.util.Optional.ofNullable(test.peek()));//tests peek again to see if we have a new top value
            // (output: 88)

            test.enqueue(27);//pushes on a new value to test if the stack can have more than 1 value

            System.out.println(java.util.Optional.ofNullable(test.peek()));//checks the new top value
            // (output: 88)

            System.out.println(test.size());//checks if size method works
            // (output: 2)

            System.out.println(java.util.Optional.ofNullable(test.dequeue()));// checks if pop method returns removed value
            // (output: 88)

            System.out.println(java.util.Optional.ofNullable(test.peek()));//checks if the pop method properly removed the old top value
            // (output: 27)

            System.out.println(test.isEmpty());//cheking if the isEmpty method works
            // (output: flase)

            System.out.println(java.util.Optional.ofNullable(test.dequeue()));//removing the next top value to then check the isEmpty emthod a second time
            // (output: 27)

            System.out.println(test.isEmpty());//cheking if the isEmpty method works
            // (output: true)

        }
    }

