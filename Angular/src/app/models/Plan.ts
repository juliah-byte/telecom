class Plan {
  planName: string;
  rate: number;
  minutes: string;
  text: string;
  international: string;
  data: string;

  constructor(
    planName: string,
    rate: number,
    minutes: string,
    text: string,
    international: string,
    data: string
  ) {
    this.planName = planName;
    this.rate = rate;
    this.minutes = minutes;
    this.text = text;
    this.international = international;
    this.data = data;
  }
}

export default Plan;
