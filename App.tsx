/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import { Text, View, Button, StyleSheet } from 'react-native';
import TextItem from './components/TextItem';

const App = () => {
  return (
    <View style={styles.container}>
      <TextItem text="TEST" />
      <Text>Hello world from React native Web</Text>
      <Button title="TEST"></Button>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: 'center',
  },
});

export default App;
