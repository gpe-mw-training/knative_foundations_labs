// camel-k: language=groovy

from('timer:clock?period=3s')
  .setBody().constant("Hello World from Camel K")
  .to('knative:channel/basic-channel')
  .log('sent message to basic channel')
