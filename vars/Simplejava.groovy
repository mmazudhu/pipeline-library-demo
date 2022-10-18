#!/usr/bin/env groovy
def call(){
     pipeline{
        agent any
        tools { 
            git 'mygit'
            maven 'mymaven'
        }
        stages{
            stage("Build"){
                steps{
                    echo "========executing Build========"
                    sh 'mvn clean install'
                }
            
            }
        }

    }
}