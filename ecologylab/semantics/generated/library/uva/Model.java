package ecologylab.semantics.generated.library.uva;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.search.bingapi.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class  Model
extends  Metadata
{

	 @simpl_collection("topic_cluster") @xml_tag("topic_clusters") @mm_name("topic_clusters") private ArrayList<TopicCluster>	topicClusters;

/**
	Constructor
**/ 

public Model()
{
 super();
}

/**
	Constructor
**/ 

public Model(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for topicClusters
**/ 

public  ArrayList<TopicCluster>	topicClusters()
{
 ArrayList<TopicCluster>	result	=this.topicClusters;
if(result == null)
{
result = new  ArrayList<TopicCluster>();
this.topicClusters	=	 result;
}
return result;
}

/**
	Set the value of field topicClusters
**/ 

public void setTopicClusters(  ArrayList<TopicCluster> topicClusters )
{
this.topicClusters = topicClusters ;
}

/**
	Get the value of field topicClusters
**/ 

public  ArrayList<TopicCluster> getTopicClusters(){
return this.topicClusters;
}

}
