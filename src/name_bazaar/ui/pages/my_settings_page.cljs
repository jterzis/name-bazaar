(ns name-bazaar.ui.pages.my-settings-page
  (:require [district0x.ui.components.misc :as misc :refer [row row-with-cols col center-layout paper page]]))

(defmethod page :route.user/my-settings []
  [:div "My Settings"])
