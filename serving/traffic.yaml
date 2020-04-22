apiVersion: serving.knative.dev/v1alpha1 # Current version of Knative
kind: Service
metadata:
  name: greeter-yaml # The name of the app
spec:
  template:
    metadata:
      name: greeter-yaml-hola
    spec:
      containers:
        - image: quay.io/rhdevelopers/knative-tutorial-greeter:quarkus # The URL to the image of the app
          env:
            - name: MESSAGE_PREFIX # The environment variable printed out by the sample app
              value: "hola"
  traffic:
  - tag: current
    revisionName: greeter-yaml-hola
    percent: 50
  - tag: prev
    revisionName: greeter-yaml-hello
    percent: 50
  - tag: latest
    latestRevision: true
    percent: 0
