import { SafeAreaView, Button, StyleSheet,Text  } from 'react-native';

export default function App() {
  const Pressed=()=>{console.log("donene")}
    return (
    <SafeAreaView style={styles.container}>
      <Text>Hii</Text>
      <Button title="Press me" onPress={Pressed}></Button>
      {console.log("entered")}
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text:{
    fontSize:33,
    fontWeight:"bold",
    margin:"10px",

  }
});
