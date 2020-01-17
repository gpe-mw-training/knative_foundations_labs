// camel-k: language=groovy

from('knative:channel/basic-channel')
  .convertBodyTo(String.class)
  .to('log:info')
