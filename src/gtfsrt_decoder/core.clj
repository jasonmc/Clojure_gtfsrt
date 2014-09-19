(ns gtfsrt-decoder.core
  (:require [flatland.protobuf.core :as protobuf]))

(defn getData [binData]
  "Decode the binary data as a FeedMessage"
  (protobuf/protobuf-load 
   (protobuf/protodef com.google.transit.realtime.GtfsRealtime$FeedMessage)
   binData))
