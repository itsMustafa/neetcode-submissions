class Solution {
    public int evalRPN(String[] tokens) {
        List<String> operators = List.of("+", "-", "*", "/");
        Stack<String> stack = new Stack<>();
        
        for(String token: tokens) {
            if (operators.contains(token)) {
                // while popping the order got reversed as operator2 was popped before operator1
                int operand1 = Integer.parseInt(stack.pop());
                int operand2 = Integer.parseInt(stack.pop());
                // hence to fix the order, swap these operands while calling performOperation method
                int result = performOperation(operand2, operand1, token);
                stack.push(String.valueOf(result));
            } else {
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.pop());
    }

    public int performOperation(int operand1, int operand2, String operator) {
        int result = 0;
        switch(operator) {
            case "+": result = operand1 + operand2; break;
            case "-": result = operand1 - operand2; break;
            case "*": result = operand1 * operand2; break;
            case "/": result = operand1 / operand2; break;
        }
        return result;
    }
}
