###############################################################
# Non-modifiable Specifications
###############################################################
# These should be stored in a meta-repository somewhere.
#
# Name of the interaction. This should be the string
# required to install and execute the application on the remocon's
# end. e.g. for android app this will be an intent action name such as
# com.github.rosjava.android_apps.listener.Listener, while for
# a web app it will be its URL.
string name

# A rocon uri string denoting the platforms this interaction
# is compatible with
string compatibility

###############################################################
# Variable Specifications
###############################################################

# User friendly version of the name. Useful to be customised
# differently from the name for either 1) branding, or 2) because
# some names are complicated visually (e.g. android names).
string display_name
 
# Should be a default for the interaction, but sometimes useful to
# override it to provide more human friendly information.
string description

# The namespace that this interaction will be associated
# with. Interfaces from the interaction will be automatically pushed
# into this namespace (for concerts it will be typically
# used by the services to push interfaces into /services/_service_name_).
# It is up to the user to make sure this is unique to avoid
# potential conflicts.
string namespace

# Again, should exist a default, but may want to override it.
rocon_std_msgs/Icon icon

# Any remappings that need to be applied
rocon_std_msgs/Remapping[] remappings

# Yaml string representing parameters for the interaction
string parameters

# Maximum number of permitted connections (-1 = any)
int32 UNLIMITED_INTERACTIONS = -1
int32 max

# The configuration for a pairing if this interaction is to be paired
# with a rapp. If not, it should be left unfilled.
Pairing pairing

###############################################################
# Parameters finalised by the interactions manager
###############################################################

# This is a crc32 hash code for the service-role-name
# unique string that identifies this interaction.
# crc32 gets a few collisions, so we should be careful of that.
# It is used by the nfc android auto-launching program so we can
# compactify the request in the url sent by the nfc to the autolauncher.
int32 hash

# The role this solution has configured the interaction for. This is in
# some use cases redundant, and in other use cases essential (e.g.
# headless launcher)
string role