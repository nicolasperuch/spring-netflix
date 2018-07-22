#!/bin/bash

echo -------------------------------------------------
echo JAVA 
echo -------------------------------------------------
sudo apt-get update
sudo apt-get -y upgrade
sudo apt-get -y install openjdk-8-jdk wget unzip
echo -------------------------------------------------
echo GRADLE
echo -------------------------------------------------
wget https://services.gradle.org/distributions/gradle-4.9-bin.zip
sudo mkdir /opt/gradle
sudo unzip -d /opt/gradle gradle-4.9-bin.zip
export PATH=$PATH:/opt/gradle/gradle-4.9/bin
echo -------------------------------------------------
echo DOCKER
echo -------------------------------------------------
sudo apt-get remove docker docker-engine docker.io
sudo apt-get update
sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    software-properties-common -y
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo apt-key fingerprint 0EBFCD88
sudo add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
   $(lsb_release -cs) \
   stable"
sudo apt-get update
sudo apt-get install docker-ce -y