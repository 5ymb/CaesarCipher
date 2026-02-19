<div align="center">
  <h1>🔐 Caesar Cipher Suite</h1>
  <p><b>A Comprehensive Java Implementation for Encryption, Decryption, and Cryptanalysis</b></p>

  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java" alt="Java">
  <img src="https://img.shields.io/badge/Security-Cryptography-blue?style=for-the-badge" alt="Cryptography">
</div>

<hr />

## 📖 Overview
The **Caesar Cipher** is one of the most famous and simplest encryption techniques. It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet. 

This repository provides a tool that not only encrypts and decrypts but also demonstrates a **Brute Force Attack**—a core concept in cybersecurity for breaking weak cryptographic shifts.



<hr />

## ⚙️ How the Algorithm Works
This implementation uses modular arithmetic to shift characters within the 26-letter English alphabet while preserving non-alphabetical characters like spaces and symbols.

<table>
  <tr>
    <th>Function</th>
    <th>Logic</th>
  </tr>
  <tr>
    <td><b>Encryption</b></td>
    <td>Each letter is shifted forward by the key $n$ using $(x + n) \mod 26$.</td>
  </tr>
  <tr>
    <td><b>Decryption</b></td>
    <td>The process is reversed using $(x - n) \mod 26$, with logic to handle negative wrap-arounds.</td>
  </tr>
  <tr>
    <td><b>Brute Force</b></td>
    <td>The system attempts all 25 possible shifts to crack the code without a known key.</td>
  </tr>
</table>

<hr />

## 🚀 Getting Started

### Prerequisites
* **Java Development Kit (JDK)** 8 or higher.

### Usage
1.  **Clone the repo:**
    ```bash
    git clone https://github.com/5ymb/CaesarCipher.git
    ```
2.  **Compile the code:**
    ```bash
    javac Caesercipher.java
    ```
3.  **Run the application:**
    ```bash
    java Caesercipher
    ```

<hr />

## 🛠️ Code Features
<ul>
  <li><code>encrypt(String ptext, int cserkey)</code>: Converts input to lowercase and maps characters to their new shifted indices.</li>
  <li><code>decrypt(String ctext, int cserkey)</code>: Reverses the shift and ensures the index stays within the valid alphabet range.</li>
  <li><code>bruteForce(String ctext)</code>: Iterates through all possible keys to demonstrate how vulnerable short-key substitution ciphers are to modern computing.</li>
</ul>

<hr />

<div align="center">
  <p><i>Developed for Educational Purposes in Cybersecurity and Cryptography.</i></p>
  <p><b>Maintained by <a href="https://github.com/5ymb">5ymb</a></b></p>
</div>
