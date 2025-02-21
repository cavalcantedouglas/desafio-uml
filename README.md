# iPhone 2007 UML Implementation in Java

## Overview
This project is a Java implementation of a UML class diagram inspired by the 2007 iPhone release presentation by Steve Jobs. The iPhone is modeled as a device combining three core features: a web browser, a telephone, and a music player. This was created as part of a learning exercise to practice UML design and Java programming.

## Features
- **iPhone**: The main class that integrates all features.
- **WebBrowser**: Simulates browsing with URL opening and zooming (inspired by Safari).
- **TelephoneDevice**: Handles calls and voicemail (reflecting the 2007 phone demo).
- **MusicPlayer**: Plays and navigates songs (mimicking the iPod functionality).

## UML Diagram
```mermaid
classDiagram
direction TB
    class iPhone {
	    -String deviceName
	    -int batteryLevel
	    +turnOn()
	    +turnOff()
    }
    class WebBrowser {
	    -boolean isConnected
	    -String currentPage
	    +openURL(url: String)
	    +zoomIn()
	    +zoomOut()
    }
    class TelephoneDevice {
	    -String phoneNumber
	    -boolean callActive
	    +makeCall(number: String)
	    +endCall()
	    +checkVoiceMail()
    }
    class MusicPlayer {
	    -String currentSong
	    -int volume
	    +playSong(song: String)
	    +stopSong()
	    +nextSong()
    }
    iPhone <|-- WebBrowser
    iPhone <|-- TelephoneDevice
    iPhone <|-- MusicPlayer

```


## How to Run
1. Clone this repository:
   ```bash
	https://github.com/cavalcantedouglas/desafio-uml.git
