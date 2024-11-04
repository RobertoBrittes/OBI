// C++ code
//
int distancia = 0;

long readUltrasonicDistance(int triggerPin, int echoPin)
{
  pinMode(triggerPin, OUTPUT);  // Clear the trigger
  digitalWrite(triggerPin, LOW);
  delayMicroseconds(2);
  // Sets the trigger pin to HIGH state for 10 microseconds
  digitalWrite(triggerPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(triggerPin, LOW);
  pinMode(echoPin, INPUT);
  // Reads the echo pin, and returns the sound wave travel time in microseconds
  return pulseIn(echoPin, HIGH);
}

void setup()
{
  pinMode(7, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
  Serial.begin(9600);

  digitalWrite(7, LOW);
  digitalWrite(8, LOW);
  digitalWrite(12, LOW);
  digitalWrite(13, LOW);
}

void loop()
{
  Serial.print("Distancia: ");
  Serial.println(distancia);
  distancia = 0.01723 * readUltrasonicDistance(5, 4);
  if (distancia < 10) {
    digitalWrite(13, HIGH);
    digitalWrite(12, HIGH);
    digitalWrite(8, HIGH);
    digitalWrite(7, HIGH);
  } else {
    if (distancia < 20) {
      digitalWrite(13, LOW);
      digitalWrite(12, HIGH);
      digitalWrite(8, HIGH);
      digitalWrite(7, HIGH);
    } else {
      if (distancia < 30) {
        digitalWrite(13, LOW);
        digitalWrite(12, LOW);
        digitalWrite(8, HIGH);
        digitalWrite(7, HIGH);
      } else {
        if (distancia < 50) {
          digitalWrite(13, LOW);
          digitalWrite(12, LOW);
          digitalWrite(8, LOW);
          digitalWrite(7, HIGH);
        } else {
          digitalWrite(13, LOW);
          digitalWrite(12, LOW);
          digitalWrite(8, LOW);
          digitalWrite(7, LOW);
        }
      }
    }
  }
  delay(10); // Delay a little bit to improve simulation performance
}