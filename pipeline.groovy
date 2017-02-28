{ ->
node('slave-android-23') {
       stage('Preparation') { // for display purposes
          input 'Ready to go?'
         
       }
       stage('CodeAnalysis'){
           
       }
       stage('Build') {
          sh 'chmod +x gradlew'
          sh "./gradlew clean build"
       }
       stage('Results') {
          
       }
   
}
}