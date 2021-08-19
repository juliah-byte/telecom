export class User {
  username: any;
  password: any;
  email: string;
  firstName: string;
  lastName: string;
  balance: number;

  constructor(
    username: string = '',
    password: string = '',
    email: string = '',
    firstName: string = '',
    lastName: string = '',
    balance: number = 0
  ) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = balance;
  }
}
