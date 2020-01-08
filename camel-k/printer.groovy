// camel-k: language=groovy

from('knative:channel/words')
  .convertBodyTo(String.class)
  .to('log:info')
